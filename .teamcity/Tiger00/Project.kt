package Tiger00

import Tiger00.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger00")
    name = "Tiger00"

    buildType(Tiger00_Hi0)
    buildType(Tiger00_Hi2)
    buildType(Tiger00_Hi1)
    buildType(Tiger00_Hi3)

    subProject(Tiger007.Project)
    subProject(Tiger008.Project)
    subProject(Tiger009.Project)
    subProject(Tiger0012.Project)
    subProject(Tiger000.Project)
    subProject(Tiger0013.Project)
    subProject(Tiger001.Project)
    subProject(Tiger0014.Project)
    subProject(Tiger0015.Project)
    subProject(Tiger002.Project)
    subProject(Tiger0016.Project)
    subProject(Tiger003.Project)
    subProject(Tiger0017.Project)
    subProject(Tiger004.Project)
    subProject(Tiger0018.Project)
    subProject(Tiger005.Project)
    subProject(Tiger0019.Project)
    subProject(Tiger006.Project)
    subProject(Tiger0010.Project)
    subProject(Tiger0011.Project)
})
