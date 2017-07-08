package Temp;

public class test {
	
	public static int mystery(String s)
	{
	    char[] letters = s.toCharArray();
	    int x = 0;
	    for (int i = 0; i < letters.length; i++) {
	        if (letters[i] == ' ') {
	           letters[i] = '_';
	           x++;
	        }
	    }
	    return x;
	}

	public static void main(String[] args) {

		String text = "My ";
		String s2 = "String";
		text = text + s2;
		
		System.out.println(text);

	

	}
	}
