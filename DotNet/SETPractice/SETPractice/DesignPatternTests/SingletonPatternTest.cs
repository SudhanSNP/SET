using DesignPattern.SingletonPattern;
using NUnit.Framework;

namespace SETPractice.DesignPatternTests
{
    [TestFixture]
    public class SingletonPatternTest
    {
        [Test]
        public void SingletonPattern()
        {
            IPrintMessage printMessage1 = PrintMessage.print;
            printMessage1.Print("Message from obj 1");
            IPrintMessage printMessage2 = PrintMessage.print;
            printMessage2.Print("Message from obj 2");

            Assert.That(printMessage1.GetHashCode(), Is.EqualTo(printMessage2.GetHashCode()));
        }
    }
}