package it.unibo.oop.lab.exception2;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * JUnit test to test
 * {@link StrictBankAccount}.
 * 
 */
public final class TestStrictBankAccount {

    /**
     * Used to test Exceptions on {@link StrictBankAccount}.
     */
    @Test
    public void testBankOperations() {
    	/*
         * 1) Creare due StrictBankAccountImpl assegnati a due AccountHolder a
         * scelta, con ammontare iniziale pari a 10000 e nMaxATMTransactions=10
         * 
         * 2) Effetture un numero di operazioni a piacere per verificare che le
         * eccezioni create vengano lanciate soltanto quando opportuno, cioè in
         * presenza di un id utente errato, oppure al superamento del numero di
         * operazioni ATM gratuite.
         */
    	AccountHolder pers1  = new AccountHolder("Mario","Rossi",1) ;
    	AccountHolder pers2  = new AccountHolder("Luigi","Bianchi",2) ;
    	StrictBankAccount acc1 = new StrictBankAccount(pers1.getUserID(), 10000, 10);
    	StrictBankAccount acc2 = new StrictBankAccount(pers2.getUserID(), 10000, 10);
    	
    	try {
    		//test if not enough founds is thrown correctly
    		acc1.withdraw(pers1.getUserID(), 15000);
    	} catch (WrongAccountHolderException e) {
    		fail("this is not the issue here");
    	} catch (NotEnoughFoundsException e) {
    		assertNotNull(e);
    	} 
    	
    	for (int i = 0; i < 10; i++ ) {
    		try {
    			// there are no exceptions here
    		    acc1.depositFromATM(pers1.getUserID(), 10);
    	        } catch (WrongAccountHolderException e) {
    	        	fail("there is no issue here");
    	        } catch (TransactionsOverQuotaException e) {
    		        fail("there is no issue here");
    	        } 
    	}
    	
    	 try {
    		 // exceed the maximum allowed transactions
    		 acc1.depositFromATM(pers1.getUserID(), 10);
    		 fail();
    	 } catch (WrongAccountHolderException e) {
     		fail("there is no issue here");
     	} catch (TransactionsOverQuotaException e) {
     		assertNotNull(e);
     	} 
    	 
    	 try {
    		 // wrong id 
             acc2.deposit(4, 100);
             fail();
         } catch (WrongAccountHolderException e) {
             assertNotNull(e);
         }
    	
    	}
        
    }

