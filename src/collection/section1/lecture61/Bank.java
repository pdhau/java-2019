package collection.section1.lecture61;

import java.util.List;

public class Bank {

    private List<Branch> branches;

    public List<Branch> getBranches() {
        return branches;
    }

    public void setBranches(List<Branch> branches) {
        this.branches = branches;
    }

    public boolean addBranch(Branch branch) {
        int branchIndex = branches.indexOf(branch);
        if (-1 != branchIndex) {
            return false;
        }
        return this.getBranches().add(branch);
    }

    public boolean addCustomer(Branch branch, Customer customer) {
        List<Branch> branches = this.getBranches();
        int branchIndex = branches.indexOf(branch);
        return branches.get(branchIndex).addCustomer(customer);
    }
}
