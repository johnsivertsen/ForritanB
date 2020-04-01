
;(function() {

function fetchGreeting() {
    fetch('http://localhost:8080/greeting')
      .then((response) => {
        return response.json();
      })
      .then((data) => {
        console.log(data);
      });
    setTimeout(fetchGreeting, 1000);
}

fetchGreeting();

})();