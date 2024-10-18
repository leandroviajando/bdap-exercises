import java.nio.charset.StandardCharsets;

public class BloomFilter {
    
    /**
     * This class implements a bloom filter with k hash functions and m bits.
     * The bloom filter is used to check if an element is in a set or not.
     * The bloom filter can have false positives but no false negatives.
     */

    
    private int logNumBits; // log of the number of bits
    private int k; // number of hash functions
    // TODO: Add other parameters as needed

    /**
     * Constructs a BloomFilter object with the specified number of bits and hash functions.
     *
     * @param logNumBits the log of the number of bits in the bloom filter
     * @param k the number of hash functions to be used
     */
    public BloomFilter(int logNumBits, int k) {
        
        this.logNumBits = logNumBits;
        this.k = k;
        // TODO: Complete this method
    }

    /**
     * Adds the specified element to the bloom filter.
     *
     * @param s the element to be added
     */
    public void add(String s) {
        // TODO: Complete this method
    }

    /**
     * Checks if the specified element is present in the bloom filter.
     *
     * @param s the element to be checked
     * @return true if the element is present, false otherwise
     */
    public boolean check(String s) {
        // TODO: Complete this method
        return true;
    }


    /**
     * Returns the index of the specified element in the bloom filter.
     *
     * @param element the element to get the index for
     * @param seed the seed value for the hash function
     * @return the index of the element in the bloom filter
     */
    private int getIndex(String element, int seed) {

        // TODO: Complete this method
        return -1;
    }


}
