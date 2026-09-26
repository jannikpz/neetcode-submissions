class Solution {

    public String encode(List<String> strs) {
        StringBuilder message = new StringBuilder();
        while(!strs.isEmpty()){
            String y = strs.remove(0);
            message.append("ä");
            int x = y.length();
            String z = Integer.toString(x);
            message.append(z);
            message.append("ä");
            message.append(y);
        }
        String result = message.toString();
        return result;
    }

    public List<String> decode(String str) {
        List<String> erg = new ArrayList<>();
        
        for(int i=0; i<str.length();){
            StringBuilder lst = new StringBuilder();
            int zahl=0;
            int zahllange;
            if(str.charAt(i) == 'ä'){
                StringBuilder lng = new StringBuilder();
                for(int k = i+1; str.charAt(k)!= 'ä';k++){
                lng.append(str.charAt(k));
                }
                String y = lng.toString();
                zahl = Integer.parseInt(y);
                zahllange = y.length();
                i = i + zahllange + 2;
            }
            while(zahl != 0){
            lst.append(str.charAt(i));
            ++i;
            --zahl;
            }
            String result = lst.toString();
            erg.add(result);
        }
        return erg;
    }
}
