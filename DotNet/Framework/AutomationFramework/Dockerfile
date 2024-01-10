FROM mcr.microsoft.com/dotnet/sdk:6.0
ENV NUNIT_PATH Nunit/nunit-console/
RUN apt-get update && apt-get install -y wget
RUN wget -q https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb
RUN apt-get install -y ./google-chrome-stable_current_amd64.deb
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp
RUN dotnet --version
RUN dotnet build AutomationFramework.sln --property WarningLevel=0