/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package messengerclient;

/**
 *
 * @author team3
 */
public interface ClientListListener
{
    void addToList(String userName);
    void removeFromList(String userName);
}
