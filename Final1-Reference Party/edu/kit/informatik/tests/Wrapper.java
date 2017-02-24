package edu.kit.informatik.tests;

import edu.kit.informatik.library.management.Main;

/**
 * Wrapper class for testing
 * 
 * @author Micha Hanselmann
 */
public class Wrapper {

    private static final String[] DEFAULT_ARGS = {};
    
    
    public static void main(String[] args) {
        
        // adjust to fit your project setup
        Main.main(args);
        
    }
    
    public static void main() {
        main(DEFAULT_ARGS);
    }

}
