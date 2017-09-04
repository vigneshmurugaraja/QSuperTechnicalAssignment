# The Ultimate Question

What do you get if you [multiply six by nine](http://en.wikipedia.org/wiki/Phrases_from_The_Hitchhiker%27s_Guide_to_the_Galaxy#Answer_to_the_Ultimate_Question_of_Life.2C_the_Universe.2C_and_Everything_.2842.29)? 

## [Example GUI](-)
When I google "[6 * 9](- "searchFor(#TEXT)")" the answer should be "[54](- "c:assertEquals=getCalculatorResult()")"

## [Example REST](-)
When I call this rest api [http://jsonplaceholder.typicode.com/posts/1](- "#url") it [returns some data](- "c:assertTrue=makeRestCall(#url)")

## [Table Example](-)
When I google the following, I expect to see the appropriate answer.

| [search][][Search For][] | [The Answer][] |
| ------------------------ | -------------: |
| 6 * 9                    | 54             |
| 6 * 7                    | 42             |

[Search For]: - "#searchFor"
[search]: - "#result = searchForTopic(#searchFor)"
[The Answer]: - "?=#result"


## [Child Containers](-)
Readability of [complex examples](- "?=complexExample(#TEXT)") can often be improved by grouping cards into section containers.

## [Test Google Title](-)
When I google "[Qsuper](- "searchFor(#TEXT)")" the answer should be "[Qsuper - Google Search](- "c:assertEquals=getQueryStringResultPage()")"

