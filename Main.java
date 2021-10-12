//each 1 should become 10 and each 0 should become 01
//program should result in 1001100101101010010110

class Main {
  public static void main(String[] args) {
    
    String code;
    code = "10100111001";

    manchesterCode(code);

  }

  public static void manchesterCode(String code){
    //code goes here
    String result = new String(); //creates a new string
    int size = code.length(); //create variable size that equals to the length of the string code

    for (int i = 0; i < size; i++) { //for loop to traverse through the length of the string
      if (code.charAt(i) == '1') { //if character at position i equals '1'
    	  result += "10";  //then return '10'. this line uses compound assignment which is same as result = result + "10";
      }

      else if(code.charAt(i) == '0') { //else if character at position i equals '0'
        result =  result + "01"; //then return '01'
      }

    }
    System.out.println(result); //prints the solution 1001100101101010010110
  }

}

//best solution is to use StringBuilder because of String immutability
//public static void manchesterCode(String code) {
	//StringBuilder str = new StringBuilder(); //creates a new empty string

	//for (char c : code.toCharArray()) { //the method toCharArray() returns an array of chars after converting a string into a sequence of characters
		//if(c == '0') { //if character c equals 0
			//str.append("01"); //append 01 to the string
//}
	//else if(c == '1') { //if c equals 1
		//str.append("10"); //append 10
  //}
//}

//System.out.println(str.toString()); 

//}

//}
