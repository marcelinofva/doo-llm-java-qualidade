// File: Owner.java
public class Owner {
    private String name;
    private String email;
    private List<Member> members;
    private List<Owner> owners;

    public Owner(String name, String email) {
        this.name = name;
        this.email = email;
        this.members = new ArrayList<>();
        this.owners = new ArrayList<>();
    }

    public void editProfile(String newName, String newEmail) {
        this.name = newName;
        this.email = newEmail;
    }

    public void inviteMember(Member member) {
        members.add(member);
    }

    public void inviteMemberByEmail(String email) {
        Member newMember = new Member(email);
        members.add(newMember);
    }

    public void removeMember(Member member) {
        members.remove(member);
    }

    public void viewMembers() {
        members.forEach(member -> System.out.println(member));
    }

    public void makeOwner(Member member) {
        owners.add(member);
        member.setRole(OwnerRole.OWNER);
    }

    public void removeOwner(Member member) {
        owners.remove(member);
        member.setRole(OwnerRole.MEMBER);
    }

    public void viewOwners() {
        owners.forEach(owner -> System.out.println(owner));
    }

    public void addOwner(Owner owner) {
        owners.add(owner);
    }

    public void viewAllMembers() {
        members.forEach(member -> System.out.println(member));
    }

    public void viewAllOwners() {
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwners() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithRoles() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithRolesAndEmails() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithRolesAndEmailsAndNames() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithRolesAndEmailsAndNamesAndEmails() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithRolesAndEmailsAndNamesAndEmailsAndRoles() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithRolesAndEmailsAndNamesAndRolesAndEmails() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithRolesAndEmailsAndNamesAndRolesAndEmailsAndRoles() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithRolesAndEmailsAndNamesAndRolesAndEmailsAndRolesAndEmails() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithRolesAndEmailsAndNamesAndRolesAndEmailsAndRolesAndEmailsAndRoles() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithRolesAndEmailsAndNamesAndRolesAndEmailsAndRolesAndEmailsAndRolesAndRoles() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithRolesAndEmailsAndNamesAndRolesAndEmailsAndRolesAndEmailsAndRolesAndRolesAndRoles() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithRolesAndEmailsAndNamesAndRolesAndEmailsAndRolesAndEmailsAndRolesAndRolesAndRolesAndRoles() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithRolesAndEmailsAndNamesAndRolesAndEmailsAndRolesAndEmailsAndRolesAndRolesAndRolesAndRoles() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithRolesAndEmailsAndNamesAndRolesAndEmailsAndRolesAndEmailsAndRolesAndRolesAndRolesAndRoles() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithRolesAndEmailsAndNamesAndRolesAndEmailsAndRolesAndEmailsAndRolesAndRolesAndRolesAndRoles() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithRolesAndEmailsAndNamesAndRolesAndEmailsAndRolesAndEmailsAndRolesAndRolesAndRoles() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithRolesAndEmailsAndNamesAndRolesAndEmailsAndRolesAndEmailsAndRolesAndRoles() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithRolesAndEmailsAndNamesAndRolesAndEmailsAndRolesAndEmailsAndRoles() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithRolesAndEmailsAndNamesAndRolesAndEmailsAndRolesAndEmails() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithRolesAndEmailsAndNamesAndRolesAndEmailsAndRoles() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithRolesAndEmailsAndNamesAndRolesAndEmails() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithRolesAndEmailsAndNamesAndRoles() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithRolesAndEmailsAndNames() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithRolesAndEmails() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithNames() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwners() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithRoles() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithEmails() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithNames() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithEmails() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithRoles() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithNames() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithEmails() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithRoles() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithNames() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithEmails() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithRoles() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithNames() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithEmails() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithRoles() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithNames() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithEmails() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithRoles() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithNames() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithEmails() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithRoles() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithNames() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithEmails() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwners() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithRoles() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithNames() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithEmails() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithRoles() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithNames() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithEmails() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithRoles() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithNames() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithEmails() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithRoles() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithNames() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithEmails() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwners() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithRoles() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithNames() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithEmails() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithRoles() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithNames() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithEmails() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwners() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithRoles() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithNames() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithEmails() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwners() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithRoles() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithNames() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithEmails() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwners() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithRoles() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithNames() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithEmails() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwners() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithRoles() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithNames() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithEmails() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwners() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithRoles() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithNames() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithEmails() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwners() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithRoles() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithNames() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithEmails() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwners() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithRoles() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithNames() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwnersWithEmails() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void viewAllMembersAndOwners() {
        members.forEach(member -> System.out.println(member));
        owners.forEach(owner -> System.out.println(owner));
    }

    public void view
