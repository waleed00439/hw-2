public class tw4 {
    public static void main(String[] args){
     String user[] = new String[10];
       user[0] = "Waleed";
        user[1] = "Kalhed";
        user[2] = "Majed";
        user[3] = "Fasil";
        user[4] = "dary";
        user[5] = "Ail";
        user[6] = "Sami";
        user[7] = "Hani";
       user[8] = "Fares";
        user[9] = "Nawaf";
         for (int i = 0; i < user.length; i++){
             if (user[i].charAt(0)  == 'A' ){
                 continue;
             }
             System.out.println(user[i]);
         }
    }
}
