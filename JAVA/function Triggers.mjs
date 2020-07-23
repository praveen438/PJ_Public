function Triggers(){
  
    ScriptApp
    .newTrigger('DeleteEmailAttachments')
    .timeBased()
    .everyDays(1)
    .create()
  
}


function setPurgeMoreTrigger(){
  ScriptApp.newTrigger('purgeMore')
  .timeBased()
  .at(new Date((new Date()).getTime() + 1000 * 60 * 2))
  .create()
}

function purgeMore() {
  DeleteEmailAttachments()
}


function DeleteEmailAttachments() {
  
  var batchSize=100;
  
  //var nextRun=(new Date((new Date()).getTime() + 1000 * 60 * 2));
  
  var BatchSearch = GmailApp.search('has:nouserlabels older_than:15d -from:archana@zettaprime.com');
  
  var BatchLength= BatchSearch.length;
   var X=0;
  var DelT =0;
  Logger.log('TotalThreadsInSearch: '+BatchLength);
  
  for(j=0;j<BatchLength;j+=batchSize){
    var A = j;
   var B = j+batchSize;
  GmailApp.moveThreadsToTrash(BatchSearch.slice(A,B));
    var Z= B-A;
     X=X+1;
     DelT +=Z;

    Logger.log('CurrentLoopNo: '+ X + '  StartingPositionOfJ:' + A + '  SliceObjectInLoop:' + B +'  DelThreadCountinLoop: '+ Z);

  }
  Logger.log('TotalLoops:' + X + '  Total thread del count:' + DelT);
  //Logger.log('Next Tigger will happen at:' + getTime() + 1000 * 60 * 2);
  var nextRun=(new Date((new Date()).getTime() + 1000 * 60 * 2));
  Logger.log('Next Run will happen at:' + nextRun);
  
  
   var triggers = ScriptApp.getProjectTriggers();
 for (var i = 0; i < triggers.length; i++) {
   ScriptApp.deleteTrigger(triggers[i]);
 }
 setPurgeMoreTrigger()
}



