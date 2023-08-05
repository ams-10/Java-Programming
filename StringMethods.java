class StringMethods{
	static void p(String s){
			System.out.println(s);
		}
	public static void main(String args[]){
		String str1 = "hello";
		String str2 = "world";
		String str3 = str1.concat(str2);
		p(str1);
		p(str2);
		p("Concatenated String : " +str3);
		p("String lowerCased : "+str3.toLowerCase());
		p("length of string : "+str3.length());
		p("index of o in string "+ str3.indexOf("o"));
	}
}