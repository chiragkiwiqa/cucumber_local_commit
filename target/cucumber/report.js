$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/AmazonTest1.feature");
formatter.feature({
  "line": 1,
  "name": "Amazon",
  "description": "",
  "id": "amazon",
  "keyword": "Feature"
});
formatter.before({
  "duration": 15231031016,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "Opening the browser and navigating to the Amazon",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I navigate to \"http://www.amazon.com/\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.amazon.com/",
      "offset": 15
    }
  ],
  "location": "AmazonTest1.i_navigate_to(String)"
});
formatter.result({
  "duration": 25773748707,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Filter Nikon product and assert Product Name in Details",
  "description": "",
  "id": "amazon;filter-nikon-product-and-assert-product-name-in-details",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@Scenario"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Enter search key : \"Nikon\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Choose Heighest to Lowest Price filter option",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Choose Second item from search result",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Product Name text should contains : \"Nikon D3X\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Nikon",
      "offset": 20
    }
  ],
  "location": "AmazonTest1.enter_search_key(String)"
});
formatter.result({
  "duration": 21516677516,
  "status": "passed"
});
formatter.match({
  "location": "AmazonTest1.choose_Heighest_to_Lowest_Price_filter_option()"
});
formatter.result({
  "duration": 5058504240,
  "status": "passed"
});
formatter.match({
  "location": "AmazonTest1.choose_Second_item_from_search_result()"
});
formatter.result({
  "duration": 27436275684,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nikon D3X",
      "offset": 37
    }
  ],
  "location": "AmazonTest1.product_Name_text_should_contains(String)"
});
formatter.result({
  "duration": 73116978,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1698646495,
  "status": "passed"
});
});