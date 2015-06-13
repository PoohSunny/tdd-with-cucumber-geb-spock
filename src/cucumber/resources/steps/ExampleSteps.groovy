import cucumber.api.PendingException

import static cucumber.api.groovy.JA.*

前提(~/^トップページにいて$/) { ->
  // Write code here that turns the phrase above into concrete actions
  throw new PendingException()
}

もし(~/^ユーザーID"(.*?)"パスワード"(.*?)"を入力して、ログインすると$/) { String arg1, String arg2 ->
  // Write code here that turns the phrase above into concrete actions
  throw new PendingException()
}
