
//Count letters, digits, and special characters.
public class pract69 {
    public static void main(String[] args) {
        String str="Adn@%32&)*^kw12*(42efv132";

        int string=0;
        int num=0;
        int special=0;

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
                string++;

            }
            else if(ch>='0'&&ch<='9'){
                num++;

            }
            else{
                special++;
            }
        }

        System.out.println("string "+string);
        System.out.println("num "+num);
        System.out.println("special "+special);
    }
    
}
