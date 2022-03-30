//event listener with closures (for demonstration callback funtions)

function attachEventListener(){
  let count = 0;
  document.getElementById('ansGen').addEventListener("click", function xyz(){
     console.log("Button clicked", ++count);
  });
};
attachEventListener();