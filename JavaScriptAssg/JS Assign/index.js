document.getElementById('addCustomerBtn').addEventListener('click', addCustomer);

function addCustomer() {
    // Clear previous error messages
    clearErrors();

    // Get input values
    var name = document.getElementById('nameInput').value.trim();
    var email = document.getElementById('emailInput').value.trim();
    var phone = document.getElementById('phoneInput').value.trim();
    var accountType = document.getElementById('accountTypeInput').value;

    // Validation
    var isValid = true;

    if (!isValidName(name)) {
        isValid = false;
        displayError('nameInput', "Please enter only alphabets");
    }

    if (!isValidEmail(email)) {
        isValid = false;
        displayError('emailInput', "Please enter a valid email address");
    }

    if (!isValidPhone(phone)) {
        isValid = false;
        displayError('phoneInput', "Please enter a 10-digit phone number starting with 7-9");
    }

    if (accountType === "disabled select") {
        isValid = false;
        displayError('accountTypeInput', "Please select an account type");
    }

    // If all inputs are valid, proceed to add customer
    if (isValid) {
        var newRow = document.createElement('tr');
        newRow.innerHTML = `
            <td>${name}</td>
            <td>${email}</td>
            <td>${phone}</td>
            <td>${accountType}</td>
        `;
        document.getElementById('customerTableBody').appendChild(newRow);

        // Clear form fields
        document.getElementById('nameInput').value = '';
        document.getElementById('emailInput').value = '';
        document.getElementById('phoneInput').value = '';
        document.getElementById('accountTypeInput').selectedIndex = 0;
    }
}

function isValidName(name) {
    return /^[A-Za-z ]+$/.test(name);
}

function isValidEmail(email) {
    // Very basic email validation, can be improved
    return /^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(email);
}

function isValidPhone(phone) {
    return /^[7-9]\d{9}$/.test(phone);
}

function displayError(inputId, errorMessage) {
    var errorSpan = document.createElement('span');
    errorSpan.textContent = errorMessage;
    errorSpan.classList.add('error');
    document.getElementById(inputId).parentNode.appendChild(errorSpan);
}

function clearErrors() {
    var errorSpans = document.querySelectorAll('.error');
    errorSpans.forEach(function(span) {
        span.parentNode.removeChild(span);
    });
}