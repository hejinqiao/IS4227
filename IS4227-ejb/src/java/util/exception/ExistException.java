/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.exception;

import javax.ejb.ApplicationException;

/**
 *
 * @author Ser3na
 */
@ApplicationException(rollback = true)
public class ExistException extends Exception {

    public ExistException() {
    }

    public ExistException(String msg) {
        super(msg);
    }
}
