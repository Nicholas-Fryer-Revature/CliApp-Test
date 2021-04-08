package cliapp

object Main {
  def main(args: Array[String]):Unit ={
    val cli = new Cli()
    cli.welcomeMessage()
    cli.menu()
  }
}