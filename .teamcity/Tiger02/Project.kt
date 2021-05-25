package Tiger02

import Tiger02.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger02")
    name = "Tiger02"

    buildType(Tiger02_Hi3)
    buildType(Tiger02_Hi0)
    buildType(Tiger02_Hi2)
    buildType(Tiger02_Hi1)

    subProject(Tiger0218.Project)
    subProject(Tiger029.Project)
    subProject(Tiger0219.Project)
    subProject(Tiger021.Project)
    subProject(Tiger0210.Project)
    subProject(Tiger0211.Project)
    subProject(Tiger022.Project)
    subProject(Tiger0212.Project)
    subProject(Tiger023.Project)
    subProject(Tiger0213.Project)
    subProject(Tiger024.Project)
    subProject(Tiger0214.Project)
    subProject(Tiger025.Project)
    subProject(Tiger0215.Project)
    subProject(Tiger026.Project)
    subProject(Tiger0216.Project)
    subProject(Tiger027.Project)
    subProject(Tiger0217.Project)
    subProject(Tiger028.Project)
    subProject(Tiger020.Project)
})
