/**
 * This is Application Startup Class with the main() method
 * @author Meenali M. Rane
 */
package com.cg.onlinegrocery.main;

import com.cg.onlinegrocery.util.MenuUtil;

public class ApplicationStartup 
{
    public static void main( String[] args )
    {
    	MenuUtil menu=new MenuUtil();
		menu.start();
    }
}