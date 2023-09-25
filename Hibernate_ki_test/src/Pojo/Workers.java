package Pojo;

	import javax.persistence.Entity;
	import javax.persistence.Id;

	@Entity
	public class Workers {
	    @Id 
		int id;
	    String name;
		public Workers() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Workers(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Override
		public String toString() {
			return "Emp [id=" + id + ", name=" + name + "]";
		}
		
		
	}

