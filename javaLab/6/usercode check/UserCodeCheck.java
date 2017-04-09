package college;

public class UserCodeCheck {

	  String code;

	    public UserCodeCheck(String usercode) {
	        code = usercode;
	    }

	    public Boolean isValid1() {
	    	if(code.length() == 6){
	    		if(code.startsWith("cod") && code.matches("[0-9a-zA-Z]+") && Character.isUpperCase(code.charAt(3)) ){
	    					if(Character.isDigit(code.charAt(4)) || Character.isDigit(code.charAt(5)) )
	    					return true;
	    				}
	    	}
	    	return false;
	    }
	
}
