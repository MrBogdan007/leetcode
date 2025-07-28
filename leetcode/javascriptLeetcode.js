    


var findNoSpecifiedInputValue = (nums,  val) => {

        for(var  j = 0; j < nums.length; j++){
            if(nums[j]==val){
                delete nums[j];
            }
        }
        return " NUMS:"+  nums + "Nums length: " + nums.length;
    }
    console.log(findNoSpecifiedInputValue([3,2,2,3], 3));