package app;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import medical.CDC;
import medical.Hospital;
import medical.NotCoronaException;
import person.Patient;

public class MainTest {
	public static void main(String[] args) {
		//병원 생성
		Hospital univHospital = new Hospital("대학병원", 15, "001" , 50, 10);
		Hospital localHospital = new Hospital("동네병원", 3, "901" , 10, 2);
		
		//환자 생성
		Patient p1 = new Patient("환자1", 42, "010-1111-1111", "호흡곤란", "001", true);
		Patient p2 = new Patient("환자2", 30, "010-2222-2222", "과음", "901", false);
		
		//병원 Collection
		List<Hospital> hospitalList = new ArrayList<Hospital>();
		hospitalList.add(univHospital);
		hospitalList.add(localHospital);
		
		//환자 Collection
		Set<Patient> patientList = new HashSet<Patient>();
		patientList.add(p1);
		patientList.add(p2);
		
		//MedicalAction Test
		CDC cdc = new CDC("질병관리본부", 200, hospitalList, patientList);
		
		Patient p3 = new Patient("환자3", 33, "010-3333-3333", "고열", "001", true);
		Patient p4 = new Patient("환자3", 33, "010-3333-3333", "고열", "001", true);

		try {
			univHospital.addPatient(cdc,p3);
		} catch (NotCoronaException e) {
			// TODO Auto-generated catch block
			System.out.println("corona 환자가 아닙니다.");
		}
		System.out.println(cdc.getPatientList());
		
	//	univHospital.removePatient(cdc, p3);
	//	System.out.println(cdc.getPatientList());
		
		try {
			univHospital.addPatient(cdc, p3);
		} catch (NotCoronaException e) {
			// TODO Auto-generated catch block
			System.out.println("corona 환자가 아닙니다.");
		}
		System.out.println(cdc.getPatientList());
		
	//	univHospital.removePatient(cdc, p4);
	//	System.out.println(cdc.getPatientList());
		
		//File Write
		String filePath = "c:" + File.separator + "SSAFY";
		String fileName = "CoronaPatientList.csv";
		
		try {
			//BufferedWriter writer = new BufferedWriter(new FileWriter(filePath+File.separator+fileName));
		
			BufferedWriter writer = new BufferedWriter( new OutputStreamWriter ( new FileOutputStream(filePath+File.separator + fileName), "MS949"));
			
			for(Patient p : patientList) {
				writer.write(p.getName() + "^" + p.getAge() + "^" + p.getPhone());
				writer.newLine();
			}
			writer.flush();
		}
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}