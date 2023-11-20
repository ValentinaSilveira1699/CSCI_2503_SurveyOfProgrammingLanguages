// Regular expression for validating student email addresses
const emailRegex = /^[a-zA-Z]{2}\d{4,5}@students\.(georgiasouthern|kennesaw|uga|gatech)\.edu$/;

// Test function
function validateStudentEmail() {
    const email = prompt("Enter a student email address:");
    
    if (emailRegex.test(email)) {
        const [username, domain] = email.split('@');
        alert(`Valid Email:\nUsername: ${username}\nUniversity: ${domain.split('.')[1]}`);
    } else {
        alert("Invalid Email Address");
    }
}

// Test the function
validateStudentEmail();
