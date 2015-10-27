/**
 * 
 * @author Alpaca King (miquel.luque.rodriguez@gmail.com)
 * @date Oct 27, 2015
 * @version 0.1
 *
 */

/**
 *
 */
public class Persona {

    private int edat;
	    
    public void setEdat(int edat) throws IllegalArgumentException {
    	if ( edat < 0 ){
    		throw new IllegalArgumentException();
    	} else {
    		this.edat = edat;
    	}
    }

	public int getEdat() {
		return edat;
	}
}