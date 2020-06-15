class Example
{
 
    public static void main(String args[])
    { 

  
        for(int i=1;i<=4;i++)
        {
           for(int j=1;j<=4;j++) 
        {
            System.out.print("* "); 
        }
        System.out.println( );
    }
     System.out.println("-----------------");
         

        for(int i=1; i<=4;i++)
        {
            for(int j=0;j<=4-i;j++)
            {
                System.out.print("* ");
            }
            System.out.println( );
        }
        System.out.println("-----------------");     

        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=5-i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println( );
        }
        System.out.println("-----------------");

        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("$ ");
            }
            System.out.println( );
        }
        System.out.println("--------------");

        for(int i=1;i<=3;i++)
        {
            for(int j=1;j<=3;j++)
            {
                if(i==2 && j==2)
                {
                    System.out.print("  ");
                }
                else{
                System.out.print("* ");
                }
            }

            System.out.println( );
        }

        // few points must be remember
        /* 
        1. when object get intialize it gets memory inside the heap block
        2. static variable does not belongs to particular object
        3. static member or variable gets a memeory in class loader
        4. static member will executes only once when class loaded.
        5. whenever object creates constructor will call. 
        6. constructor will call for every object.
        7. for particular class you can create multiple objects.
        8. constuctor will use to initalize the objects which is non static in java for static variable there is a static block inside 
           block we can initialize static variable.
        */
    }

}
