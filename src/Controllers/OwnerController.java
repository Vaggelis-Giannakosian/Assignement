package Controllers;

import Models.Insurance;
import Models.Owner;

import java.util.ArrayList;
import java.util.UUID;

/**
 * @author NikolaosPapazian
 * @version 1.0
 */
public class OwnerController {

    /*
    to get the data from database
    C# Code
    private DBEntities db = new DBEntities();

    // GET: Employees
    public ActionResult Index()
    {
        var employees = db.Table;
        return View(employees.ToList());
    }
    */
    private ArrayList<Owner> ownerList;

    /**
     * Constructor
     * @version 1.0
     * @since 22/11/18
     * @param owner
     */
    public OwnerController(ArrayList<Owner> owner) {
        this.ownerList = owner;
    }

    /**
     * @version 1.0
     * @since 22/11/18
     * @return ArrayList<Owner>
     */
    public ArrayList<Owner> getOwnerList() {
        return ownerList;
    }

    /**
     * @version 1.0
     * @since 22/11/18
     * @param ownerID
     * @return Owner | null
     */
    public Owner getOwner(UUID ownerID){
        for (Owner owner:ownerList) {
                    if(ownerID.equals(owner.getOwnerID())){
                        return owner;
            }
        }
        return null;
    }

    /**
     * set ArrayList of Owners
     * @version 1.0
     * @since 22/11/18
     * @param ownerList
     */
    public void setOwnerList(ArrayList<Owner> ownerList) {
        this.ownerList = ownerList;
    }

    /**
     * add new value to ownerList
     * @version 1.0
     * @since 22/11/18
     * @param owner
     */
    public void setOwner(Owner owner) {
        this.ownerList.add(owner);
    }
}
