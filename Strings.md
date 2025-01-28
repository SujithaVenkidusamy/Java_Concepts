### STRINGS:
## 1. Concatenation:
````java[]

public class Main
{
	public static void main(String[] args) {
	    String str1="Hello";
	    String str2="World";
		System.out.println("Statement :" +str1+ " "+str2);
	}
}
````

## 2. Length:
````java[]
public class Main
{
	public static void main(String[] args) {
	    String str="Hello";
	    int length=str.length();
		System.out.println("Statement :" +length);
	}
}
````

## 3. CharAt:
````java[]

public class Main
{
	public static void main(String[] args) {
	    String str="Hello World";
	    char ch=str.charAt(4);// 4th index value
		System.out.println("Statement :" +ch);
	}
}

````

## 4. Boolean:
````java[]

public class Main
{
	public static void main(String[] args) {
	    String str1="hello world";
	    String str2="HELLO WORLD";
	    
		System.out.println("Statement :" +str1.equals(str2));//false beacuse of different case letters
	}
}

*****************************************************************************************************
public class Main
{
	public static void main(String[] args) {
	    String str1="hello world";
	    String str2="HELLO WORLD";
	    
		System.out.println("Statement :" +str1.equalsIgnoreCase(str2));//true because case are ignored
	}
}
````

## 5. UpperCase:
````java[]

public class Main
{
	public static void main(String[] args) {
	    String str="hello world";
		System.out.println("Statement :" +str.toUpperCase());
	}
}
````

## 6. LowerCase:
````java[]

public class Main
{
	public static void main(String[] args) {
	    String str="HeLLo woRLD";
		System.out.println("Statement :" +str.toLowerCase());
	}
}
````

## 7. IndexOf:
````java[]

public class Main
{
	public static void main(String[] args) {
	    String str="HELLO WORLD";
		System.out.println("IndexOf :" +str.indexOf('L'));//i-small(Camel case)
	}
}
````

## 8. Last indexOf: 
````java[]

public class Main
{
	public static void main(String[] args) {
	    String str="HELLO WORLD";
		System.out.println("LastIndexOf :" +str.lastIndexOf('L'));//l-small,I-caps(Camel case)
	}
}
````

## 9. Startswith:
````java[]

public class Main
{
	public static void main(String[] args) {
	    String str="Welcome to JAVA training";
		System.out.println("StartsWith :" +str.startsWith("Welcome"));
	}
}
````

## 10. Endswith:
````java[]

public class Main
{
	public static void main(String[] args) {
	    String str="Welcome to JAVA training";
		System.out.println("EndsWith :" +str.endsWith("training"));
	}
}
````

## 11. Substring:
````java[]

public class Main
{
	public static void main(String[] args) {
	    String str="Welcome to JAVA training";
		System.out.println("Substring :" +str.substring(11));
	}
}
````

## 12. Trim: 
````java[]

public class Main
{
	public static void main(String[] args) {
	    String str="  Welcome to JAVA training  ";
	    System.out.println("Trim : " +str.trim());//removes extra spaces at starting and ending 
	}
}
````

## 13. Replace:
````java[]

public class Main
{
	public static void main(String[] args) {
	    String str="  Welcome to JAVA training  ";
	    System.out.println("Replace : " +str.replace('t','T')); 
	}
}
````

## 14. ReplaceAll:
````java[]

public class Main
{
	public static void main(String[] args) {
	    String str="Welcome to JAVA training";
	    System.out.println("ReplaceAll : " +str.replaceAll("Welcome","Hello")); 
	}
}
````

## 15. Reverse a String:
````java[]

public class Main
{
	public static void main(String[] args) {
	    String str="Welcome to JAVA training";
	    String reversed=" ";
	    for(int i=str.length()-1;i>=0;i--){
	        reversed += str.charAt(i);
	    }
	    System.out.println("Reversed String : " +reversed); 
	}
}
````

## 16. Occurance of a character in String: 
````java[]

public class Main
{
	public static void main(String[] args) {
	    String str="Sujitha";
	    char ch='a';
	    int count=0;
	    for(int i=0;i<str.length();i++){
	        if(str.charAt(i)==ch){
	            count++;
	        }
	    }
	    System.out.println("Occurance of a character in String : " +count); 
	}
}
````

## 17. Check if a string is having only alphabetical characters:
````java[]

public class Main
{
	public static void main(String[] args) {
	    String str="Welcome to JAVA training";
	    if(str.matches("[a-z A-Z]+")){
	        System.out.println("Alphabetical characters ="+true);
	        
	    }
	    else{
	         System.out.println("Alphabetical characters ="+false);
	        
	    }
	   
	}
}
````
