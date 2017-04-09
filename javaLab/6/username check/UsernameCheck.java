package college;

public class UsernameCheck {

    String name;

    public UsernameCheck(String username) {
        name = username;
    }

    public Boolean isValid() {
    	if(name.length() == 12){
    		if(name.endsWith("_job")){
    			return true;
    		}
    	}
    	return false;
    }
}