package Search;

public class SeqSearch {
    public int seqSearch(int[] array, int key) {
    	for(int i = 0; i < array.length; i++) {
    		if(array[i] == key)
    			return i;
    	}
    	return -1;
    }
    
    public int seqSearchWhile(int[] array, int key) {
    	int i = 0;
    	while(i < array.length) {
    		if(array[i] == key)
    			return i;
    		i++;
    	}
    	return -1;

    }
}
