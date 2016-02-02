public class Driver {
	public static void main(String[] args) {
		StartUp stp = new StartUp();
		Member x = new Member("Alex");
		Member x = new Member("Beni);
		Member x = new Member("Cakra");
		Member x = new Member("Deni");
		Member x = new Member("Eric",");
		stp.addMember(x);
		stp.addMember(x);
		stp.addMember(x);
		stp.addMember(x);
		stp.addMember(x);
		
		stp.createNewProject("project 1");
		stp.createNewProject("project 2");
		
		Project p = stp.getProject(0);
		x = stp.getProject(0);
		stp.setProjectMember(p,x);
		p = stp.getProject(1);
		stp.setProjectMember(p,x);
		
		m = stp.getMember(4);
		p = stp.getProject(0);
		stp.setProjectMember(p,x);
		
		stp.releaseProject(stp.getProject(0));
		
		System.out.println(stp.getMember(0).toString());
		System.out.println(stp.getMember(4).toString());
		System.out.println(stp.getProject(0).toString());
		System.out.println(stp.getProject(1).toString());
		System.out.println("Project has been released : "+stp.getNumReleasedProject());
	}
}

