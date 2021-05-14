function commit(){
  if(confirm("Wanna hear a joke?")){ 
    tellJoke();
     }
}

function tellJoke(){
    num = (Math.round(Math.random() * 5));
    guess = prompt(joke[num]);
  if (guess.toLowerCase() === answer[num].toLowerCase()) {
    alert(gratitude[num]);
  }

}



      
var joke = [
  "What do you call a cow with no legs?", "Where do you find a cow with no legs?", "What did the mama cow say to the baby cow?", "What do you call a grumpy cow?", "What do you call a cow that doesn't give milk?", "What did the cow confess to his therapist?"
];

var answer = [
  "ground beef", "where you left it", "it's pasture bedtime", "mooooooo-dy", "a milk dud no wait... a udder failure", "i feel seen but not herd"
];

var gratitude = [
 "That's right how did you know, you are so SMART", "How did you know you are Cheating", "Are you kidding you are so Smart Smarter than me", "Again you are on a roll", "Are you a robot becasue you are getting them right", "Great job do them again"
];
