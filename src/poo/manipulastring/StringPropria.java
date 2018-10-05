

public class StringPropria {
    private String str;

    public StringPropria(String str){
    	this.str = str;
    }

    public void setStr(String str){
    	this.str = str;
    }
    public String getStr(){
    	return this.str;
    }

    public boolean isEqual(StringPropria outraString){
    	if (this.str.equals(outraString.getStr())) {
    		return true;
    		
    	}
    	else
    		return false;
    }
    public boolean isEqualIgnoreSpace(StringPropria outraString){
    	if (this.str.equals(outraString.getStr().replace(" ", ""))) {
    		return true;
    		
    	}
    	else
    		return false;
    }
    public boolean isEqualIgnorePontuation(StringPropria outraString){
    	if (this.str.replaceAll("[^0-9]","").equals(outraString.getStr().replaceAll("[^0-9]",""))) {
    		return true;
    		
    	}
    	else 
    		return false;
    }
}
