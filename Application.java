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

		#feature302  changes by Keerthi...Login Module
		public class Object_Pass_Return 
{
    int length, breadth, area;
    Object_Pass_Return area1(Object_Pass_Return object1)
    {
        object1 = new Object_Pass_Return();
        object1.length = this.length;
        object1.breadth = this.breadth;
        object1.area = object1.length * object1.breadth;
        return object1;
    }
    Object_Pass_Return area2(Object_Pass_Return object2)
    {
        object2 = new Object_Pass_Return();
        object2.length = this.length + 5;
        object2.breadth = this.breadth + 6;
        object2.area = object2.length * object2.breadth;
        return object2;
    }
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

