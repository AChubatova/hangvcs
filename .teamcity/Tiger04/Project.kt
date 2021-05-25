package Tiger04

import Tiger04.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger04")
    name = "Tiger04"

    buildType(Tiger04_Hi0)
    buildType(Tiger04_Hi2)
    buildType(Tiger04_Hi1)
    buildType(Tiger04_Hi3)

    subProject(Tiger0416.Project)
    subProject(Tiger0417.Project)
    subProject(Tiger0418.Project)
    subProject(Tiger0419.Project)
    subProject(Tiger043.Project)
    subProject(Tiger044.Project)
    subProject(Tiger0410.Project)
    subProject(Tiger045.Project)
    subProject(Tiger0411.Project)
    subProject(Tiger046.Project)
    subProject(Tiger0412.Project)
    subProject(Tiger047.Project)
    subProject(Tiger0413.Project)
    subProject(Tiger048.Project)
    subProject(Tiger0414.Project)
    subProject(Tiger049.Project)
    subProject(Tiger0415.Project)
    subProject(Tiger040.Project)
    subProject(Tiger041.Project)
    subProject(Tiger042.Project)
})
