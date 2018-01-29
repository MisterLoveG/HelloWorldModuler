if (typeof kotlin === 'undefined') {
  throw new Error("Error loading module 'front'. Its dependency 'kotlin' was not found. Please, check whether 'kotlin' is loaded prior to 'front'.");
}
var front = function (_, Kotlin) {
  'use strict';
  var throwCCE = Kotlin.throwCCE;
  var Unit = Kotlin.kotlin.Unit;
  function main$lambda(closure$content, closure$xmlHttpRequest) {
    return function (it) {
      closure$content.append(closure$xmlHttpRequest.responseText);
      return Unit;
    };
  }
  function main(args) {
    var tmp$;
    var content = Kotlin.isType(tmp$ = document.getElementById('content'), HTMLDivElement) ? tmp$ : throwCCE();
    var xmlHttpRequest = new XMLHttpRequest();
    xmlHttpRequest.open('GET', 'http://192.168.0.5:8810/api/hello');
    xmlHttpRequest.responseType = 'text';
    xmlHttpRequest.onload = main$lambda(content, xmlHttpRequest);
    xmlHttpRequest.send();
  }
  _.main_kand9s$ = main;
  main([]);
  Kotlin.defineModule('front', _);
  return _;
}(typeof front === 'undefined' ? {} : front, kotlin);

//# sourceMappingURL=front.js.map
