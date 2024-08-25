package Introduction_to_classes;

public class student {
    public String name;
    public int roll_no;
    public int m1,m2,m3;

    public int avgmrks()
    {
        return (m1+m2+m3)/3;
    }
    public int max()
    {
        if (m1>m2 && m1>m3)
            return m1;
        else if (m2>m1 && m2>m3)
        return m2;
        else
            return m3;
    }
}
class std
{
    public static void main(String[] args) {
        student st = new student();
            st.name="Ashish";
            st.roll_no=17;
            st.m1=87;
            st.m2=85;
            st.m3=90;
        System.out.println("avg marks is: "+st.avgmrks());
        System.out.println("max marks is: "+st.max());

    }
}
