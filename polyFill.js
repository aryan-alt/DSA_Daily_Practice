const data = [2, 3, 4, 5, 6];

function polyFillMap(arr, cb){
  let newArr = [];
  
  for(let i = 0; i < arr.length; i++){
    newArr.push(cb(arr[i]));
  }
  
  return newArr;
}

function square(x){
  return x*x;
}
console.log(polyFillMap(data, square));

//polyfill for filter

function myFilter(arr, cb){
  let nArr = [];
  
  for(let i = 0; i < arr.length; i++){
    if(cb(arr[i]))
      nArr.push(arr[i]);
  }
  
  return nArr;
}

function evenNums(x){
  return x%2 == 0;
}

console.log(myFilter(data, evenNums));