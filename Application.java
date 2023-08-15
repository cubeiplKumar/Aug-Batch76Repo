    import java.util.Scanner;

    public class Return_Value
    {
        void input()
        {
            int x, y, z;
            Scanner s = new Scanner(System.in);
            System.out.print("Enter first integer:");
            x = s.nextInt();
            System.out.print("Enter second integer:");
            y = s.nextInt();
            z = add(x, y);
            System.out.println("Result:"+z);
        }
        int add(int a, int b)
        {
            int c;
            c = a + b;
            return c;
        }
        public static void main(String[] args) 
        {
            Return_Value obj = new Return_Value();
            obj.input();
        }
		##feature301 branch following changes made by venkat ....Reports Module
		class ReturnDemo 
	{
    public static void main(String args[]) 
    {
        Box cuboid = new Box();
        double vol;
	vol = cuboid.volume();
        System.out.println("Volume is " + vol);
    }
}    
}