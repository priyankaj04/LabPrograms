 import java .io.*;
 import java.util.*;
 import java.io.IOException;
 class stack
 {
  public static void main (String args[])throws IOException
  {
    Stack st=new Stack();
    int ch;
    DataInputStream br=new DataInputStream(System.in);
    String S=new String();
    do
    {
      System.out.println("\n\nMENU\n\n1.PUSH\n\n2.POP\n\n3.PEEK\n\n4.DISPLAY\n\n5.SEARCH\n\n6.EXIT\n\n");
      System.out.println("enter your choice:");
      ch=Integer.parseInt(br.readLine());
      switch(ch)
      {
           case 1:
                 System.out.println("enter the elements to be pushed into the stack:");
                 S=br.readLine();
                 st.push(new Integer(S));
                 break;
          case 2:try
             {
                 System.out.println("element popped is :" +st.pop());
              }
               catch(Exception e)
              {
               System.out.println("stack is empty");
              }
              break;
         case 3:try
	{ 
		Integer a=(Integer)st.peek();
		System.out.println("Elements on top of the stack is:"+a);
		}
		catch(Exception e)
		{	
		System.out.println("empty");
	}	
	break;
	case 4:
		System.out.println(""+st);
		break;
	case 5:
		System.out.println("enter the search element:");
		int c=Integer.parseInt(br.readLine());
		int k=st.search(new Integer(c));
		if(k==-1)
		System.out.println("element not found");
		else
		System.out.println("Element found at position"+ k+1);
		break;
	case 6:
		System.exit(0);
		break;
	}
}
while(ch!=6);
}
}
                
