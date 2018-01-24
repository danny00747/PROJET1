package Heritage;

public class Word {
	
	
	    private String s;
	    private int o;

	    public Word (String mot, int occurence)
	    {
	        this.s = mot;
	        this.o = occurence;
	    }

	    public String getWord(){
	        return this.s;
	    }

	    public int getOcc(){
	        return this.o;
	    }

	    /*
	     * @pre -
	     * @post retourne le mot avec la plus grande occurence
	     */
	    public String higherOcc(Word anotherWord)
	    {
	        if(anotherWord.getOcc() > this.getOcc() )
	        {
	            return anotherWord.getWord();
	        }
	        else
	        {
	            return this.s;
	        }
	    }

	    public String toString(String s, int o)
	    {
	        return s + o;
	    }

	    /**
	     * @pre -
	     * @post -retourne ?-1 si this.s est avant dans l'alphabet
	     *                 ?0 si il est ?gal
	     *                 ?1 si il est apr?s dans l'alphabet
	     */
	    public int compareTo(Word anotherWord) 
	    {
	        return(this.getWord().compareTo(anotherWord.getWord()));
	    }
	}


