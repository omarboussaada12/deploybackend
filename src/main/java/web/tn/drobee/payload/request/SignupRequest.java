package web.tn.drobee.payload.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
 
public class SignupRequest {
    @NotBlank
    @Size(min = 3, max = 20)
    private String username;
    
    @NotBlank
	@Size(max = 20)
	private String Firstname;
	
	@NotBlank
	@Size(max = 20)
	private String lastname;

	@NotBlank
	@Size(max = 15)
	private String phone;
	
	@NotBlank
	@Size(max = 50)
	private String address;

	@NotBlank
    @Size(max = 50)
    @Email
    private String email;
    
    private String role;
    
    @NotBlank
    @Size(min = 6, max = 40)
    private String password;
  
    public String getUsername() {
        return username;
    }
 
    public void setUsername(String username) {
        this.username = username;
    }
 
    public String getEmail() {
        return email;
    }
    public String getFirstname() {
  		return Firstname;
  	}

  	public void setFirstname(String firstname) {
  		Firstname = firstname;
  	}

  	public String getLastname() {
  		return lastname;
  	}

  	public void setLastname(String lastname) {
  		this.lastname = lastname;
  	}

  	public String getPhone() {
  		return phone;
  	}

  	public void setPhone(String phone) {
  		this.phone = phone;
  	}

  	public String getAddress() {
  		return address;
  	}

  	public void setAdress(String address) {
  		this.address = address;
  	}
 
    public void setEmail(String email) {
        this.email = email;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setAddress(String address) {
		this.address = address;
	}
    
  
}
