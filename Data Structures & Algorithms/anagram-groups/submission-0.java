class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list=new ArrayList<>();
        Map<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] s1=strs[i].toCharArray();
            Arrays.sort(s1);
            String s=new String(s1);
            if(!map.containsKey(s)){
                map.put(s,new ArrayList<>());
            }
            map.get(s).add(strs[i]);
        }
        for(String s:map.keySet()){
            List<String> ls=new ArrayList<>();
            for(String x:map.get(s)){
                ls.add(x);
            }
            list.add(ls);
        }
        return list;
    }
}
