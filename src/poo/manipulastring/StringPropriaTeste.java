

public class StringPropriaTeste {
    public static void main(String[] args) {
    	StringPropria str = new StringPropria("a b c");
    	StringPropria str1 = new StringPropria("abc");

    	str.setStr("a!b!c");
    	str1.setStr("a??b??c??");
    	System.out.println(str.isEqualIgnorePontuation(str1));
    }
}
