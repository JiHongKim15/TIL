class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean answer = true;

        int roomSize = rooms.size();
        boolean[] roomCheck = new boolean[roomSize];

        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        roomCheck[0] = true;

        while (!q.isEmpty()) {
            int room = q.poll();
            List<Integer> keys = rooms.get(room);

            keys.stream().filter(k -> roomCheck[k] == false)
                    .collect(Collectors.toList())
                    .forEach(k -> {
                        q.add(k);
                        roomCheck[k] = true;
                    });
        }

        for(boolean room : roomCheck){
            if(!room){
                answer = false;
                break;
            }
        }


        return answer;

    }
}