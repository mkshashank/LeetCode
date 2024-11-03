class Solution {
    public String reformatDate(String date) {
        int dayIndex = 0;
        String[] arr = date.split(" ");
        StringBuilder sb = new StringBuilder();
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("Jan",1);
        map.put("Feb",2);
        map.put("Mar",3);
        map.put("Apr",4);
        map.put("May",5);
        map.put("Jun",6);
        map.put("Jul",7);
        map.put("Aug",8);
        map.put("Sep",9);
        map.put("Oct",10);
        map.put("Nov",11);
        map.put("Dec",12);
        sb.append(arr[2]);
        sb.append("-");

        if(map.get(arr[1]) < 10)
        {
            sb.append("0");
            sb.append(map.get(arr[1]));
        }
        else
            sb.append(map.get(arr[1]));
        sb.append("-");

        for(int i = 0; i < arr[0].length(); i++)
        {
            if(Character.isLetter(arr[0].charAt(i)))
            {
                dayIndex = i;
                break;
            }
        }

        String d = arr[0].substring(0,dayIndex);
        int day = Integer.parseInt(d);

        if(day < 10)
        {
            sb.append("0");
            sb.append(day+"");
        }
        else
            sb.append(day+"");

        return sb.toString();
    }
}