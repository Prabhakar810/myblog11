public class Main {
    public static void main(String[] args) {

        String s1=new String("Prabhakar");

        System.out.println(s1);

        System.out.println(s1.length());

        System.out.println(s1.toLowerCase());

        System.out.println(s1.toUpperCase());

        System.out.println(s1.startsWith("P"));

        System.out.println(s1.endsWith("r"));

        System.out.println(s1.charAt(0));

        System.out.println(s1.concat("S"));

        boolean p = s1.contains("P");

        System.out.println(p);

        System.out.println(s1.indexOf('k'));

        System.out.println(s1.trim());

        System.out.println(s1.replace('P','K'));

        System.out.println(s1.substring(2,7));

        for (int i=s1.length()-1;i>0;i--){
            System.out.print(s1.charAt(i));
        }

        System.out.println(s1.lastIndexOf('r'));

    }
}