public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Prabhakar Kumar Bengaluru");

        System.out.println(sb.capacity());

        System.out.println(sb.length());

        System.out.println(sb.append(2));

        System.out.println(sb.append('w'));

        System.out.println(sb.append(45.6));

        System.out.println(sb.charAt(1));

        System.out.println(sb.codePointAt(1));

        System.out.println(sb.codePointAt(0));

        System.out.println(sb.delete(9,11));

        System.out.println(sb.deleteCharAt(10));

        System.out.println(sb.insert(2,"PP"));

        System.out.println(sb.indexOf("P"));

        System.out.println(sb.lastIndexOf("a"));

        System.out.println(sb.capacity());
        sb.ensureCapacity(100);
        sb.append("Hello");
        sb.trimToSize();
        System.out.println(sb.capacity());

        System.out.print(sb.reverse());

        System.out.println(sb.capacity());
                System.out.println(sb.capacity());
                System.out.println(sb.capacity());
                System.out.println(sb.capacity());
    }
}
